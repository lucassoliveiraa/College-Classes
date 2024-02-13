import { useState, useEffect } from "react"

export default function Lista() {
    const [imoveis, setImoveis] = useState([]);
    const [bairro, setBairro] = useState("");
    const [loading, setLoading] = useState(false);

    useEffect( () => {
        if (bairro) {
            setLoading(true);
            fetchComBairro();
        } else {
            setLoading(true);
            fetchSemBairro();
        }
    }, [bairro])

    const fetchComBairro = async() => {
        try {
            const response = await fetch(`http://localhost:8080/imovel/listar/${bairro}`);
            const data = await response.json();
            setImoveis(data);
            setLoading(false);

        } catch (error) {
            console.log(`Erro ao carregar fetch com bairro`, error);
            setLoading(false);
        }
    };

    const fetchSemBairro = async() => {
        try {
            const response = await fetch(`http://localhost:8080/imovel/listar`);
            const data = await response.json();
            setImoveis(data);
            setLoading(false);
        } catch (error) {
            console.log(`Erro ao carregar fetch sem bairro`, error)
        }
    };

    const handleConfirm = () => {
        if (bairro) {
            setLoading(true);
            fetchComBairro();
        }
    }

    const handleDelete = async(itemId) => {
        try {
            setLoading(true);
            const response = await fetch(`http://localhost:8080/imovel/deletar/${itemId}`, {
                method: "DELETE"
            });
            if (response.ok) {
                fetchSemBairro();
            } else {
                console.log("Erro ao deletar o imovel", response.status);
            }
            
        } catch (error) {
            console.log("Erro ao deletar o imovel", error);
        } finally {
            setLoading(false);
        }
    }
    
    return (
        <div>
            <label htmlFor="bairro">Bairro:</label>
            <input 
                type="text"
                id="bairro"
                value={bairro}
                onChange={(e) => setBairro(e.target.value)}
            />
            <button onClick={handleConfirm}>Confirmar</button>
            {loading ? (
                <p>Carregando</p>
            ) : (
                <div>
                    {imoveis.map((imovel) => (
                        <div key = {imovel.idImovel}>
                            <img src= {imovel.foto} alt="foto" />
                            <div>
                                Bairro: {imovel.bairro},
                                Rua: {imovel.rua},
                                Numero: {imovel.ncasa},
                                Descrição: {imovel.descricao},
                                Valor: {imovel.valor}
                            </div>
                            <button onClick={() => handleDelete(imovel.idImovel)}>DELETAR</button>
                        </div>
                    ))}
                </div>
            )}
        </div>
    )
}