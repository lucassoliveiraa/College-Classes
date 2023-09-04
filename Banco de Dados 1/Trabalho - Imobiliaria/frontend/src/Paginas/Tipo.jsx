import { useState } from 'react';
  
export default function Tipo() {
    const[propi, setPropis] = useState([]);
    const[imovel, setImovel] = useState({
      idTipo: 0,
      idProp: 0,
      qtdQuartos: 0,
      qtdSuites: 0,
      qtdSalasDeEstar: 0,
      qtdSalasDeJantar: 0,
      nVagasGaragem: 0,
      area: 0,
      armarioEmbutido: 0,
      andar: 0,
      valorCondominio: 0,
      portaria24h: 0,
      qtdBanheiros: 0,
      qtdComodos: 0,
      largura: 0,
      comprimento: 0,
      topografia: '',
      disponibilidade: '',
      status: 'Disponivel',
      bairro: '',
      rua: '',
      nCasa: 0,
      valor: 0,
      descricao: '',
      dataCadastro: new Date()
    });

    const load = async() => {
      try {
          const response = await fetch('http://localhost:8080/proprietario/listar');
          const data = await response.json();
          setPropis(data);
      } catch (error) {
          console.log(`Erro ao carregar fetch com bairro`, error);
      }
    };
    load();

    const handleSubmit = () => {
      fetch('http://localhost:8080/imovel/cadastrar', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(imovel),
      })
        .then((response) => response.json())
        .then((data) => {
          // Processar a resposta da API, se necessário
          console.log(data);
        })
        .catch((error) => {
          // Lidar com erros de requisição
          console.error(error);
        });
    };

  /*const handleSubmit = async (e) => {
    e.preventDefault();

    const imovelJSON = JSON.stringify(imovel);
    try {
        
    } catch (error) {
        
    }
  }*/ 

  return (
    <div>
      <h2>Formulário de Imóvel</h2>

      <label htmlFor="tipo">Tipo:</label>
      <select id="tipo" value={imovel.idTipo} onChange={(e) => setImovel( { ...imovel, idTipo: parseInt(e.target.value)})}>
        <option value={0}>Selecione o tipo</option>
        <option value={1}>Casa</option>
        <option value={2}>Apartamento</option>
        <option value={3}>Comercial</option>
        <option value={4}>Terreno</option>
      </select>

      {imovel.idTipo === 1 && (
        <>
          <label htmlFor="prop">ID do proprietário:</label>
          <select id="prop" value={imovel.idProp} onChange={(e) => setImovel( { ...imovel, idProp: parseInt(e.target.value)})}>
            {propi.map((prop) => (
              <option key = {prop.idProp} value = {prop.idProp}> 
                Nome: {prop.nome},
                CPF: {prop.cpf}
              </option>
            ))}
          </select>
         
          <label htmlFor="qtdQuartos">Quantidade de Quartos:</label>
          <input
            type= "Number"
            id="qtdQuartos"
            value={imovel.qtdQuartos}
            onChange={(e) => setImovel( { ...imovel, qtdQuartos: parseInt(e.target.value)})}
          />
          <label htmlFor="qtdSuites">Quantidade de Suites:</label>
          <input
            type="Number"
            id="qtdSuites"
            value={imovel.qtdSuites}
            onChange={(e) => setImovel( { ...imovel, qtdSuites: parseInt(e.target.value)})}
          />
          <label htmlFor="qtdSalasDeEstar">Quantidade de Salas de Estar:</label>
          <input
            type="Number"
            id="qtdSalasDeEstar"
            value={imovel.qtdSalasDeEstar}
            onChange={(e) => setImovel( { ...imovel, qtdSalasDeEstar: parseInt(e.target.value)})}
          />
          <label htmlFor="qtdSalasDeJantar">Quantidade de Salas de Jantar:</label>
          <input
            type="Number"
            id="qtdSalasDeJantar"
            value={imovel.qtdSalasDeJantar}
            onChange={(e) => setImovel( { ...imovel, qtdSalasDeJantar: parseInt(e.target.value)})}
          />
          <label htmlFor="nVagasGaragem">Numero de vagas garagem:</label>
          <input
            type="Number"
            id="nVagasGaragem"
            value={imovel.nVagasGaragem}
            onChange={(e) => setImovel( { ...imovel, nVagasGaragem: parseInt(e.target.value)})}
          />

          <label htmlFor="area">Area: </label>
          <input
            type="Number"
            id="area"
            value={imovel.area}
            onChange={(e) => setImovel( { ...imovel, area: parseInt(e.target.value)})}
          />

          <label htmlFor="armarioEmbutido">Possui armario embutido: </label>
          <select type = "Number" id = "armarioEmbutido" value = {imovel.armarioEmbutido} onChange = {(e) => setImovel( { ...imovel, armarioEmbutido: e.target.value})}>
            <option value = {0}>Sim</option>
            <option value = {1}>Nao</option>
          </select>

          <label htmlFor="disponibilidade">Disponibilidade: </label>
          <select type = "Text" id="disponibilidade" value={imovel.disponibilidade} onChange={(e) => setImovel( { ...imovel, disponibilidade: e.target.value})}>
            <option value='Venda'>Venda</option>
            <option value='Aluguel'>Aluguel</option>
          </select>

          <label htmlFor="bairro">Bairro: </label>
          <input
            type="Text"
            id="bairro"
            value={imovel.bairro}
            onChange={(e) => setImovel( { ...imovel, bairro: e.target.value})}
          />

          <label htmlFor="rua">Rua: </label>
          <input
            type="Text"
            id="rua"
            value={imovel.rua}
            onChange={(e) => setImovel( { ...imovel, rua: e.target.value})}
          />

          <label htmlFor="nCasa">Numero casa: </label>
          <input
            type="Number"
            id="nCasa"
            value={imovel.nCasa}
            onChange={(e) => setImovel( { ...imovel, nCasa: parseInt(e.target.value)})}
          />

          <label htmlFor="valor">Valor: </label>
          <input
            type="Number"
            id="valor"
            value={imovel.valor}
            onChange={(e) => setImovel( { ...imovel, valor: parseFloat(e.target.value)})}
          />

          <label htmlFor="descricao">Descricao: </label>
          <input
            type="Text"
            id="descricao"
            value={imovel.descricao}
            onChange={(e) => setImovel( { ...imovel, descricao: e.target.value})}
          /> 
        </>
        
      )}

      {imovel.idTipo === 2 && (
        <>
          <label htmlFor="prop">ID do proprietário:</label>
          <select id="prop" value={imovel.idProp} onChange={(e) => setImovel( { ...imovel, idProp: parseInt(e.target.value)})}>
            {propi.map((prop) => (
              <option key = {prop.idProp} value = {prop.idProp}> 
                Nome: {prop.nome},
                CPF: {prop.cpf}
              </option>
            ))}
          </select>
          <label htmlFor="qtdQuartos">Quantidade de Quartos:</label>
          <input
            type= "Number"
            id="qtdQuartos"
            value={imovel.qtdQuartos}
            onChange={(e) => setImovel( { ...imovel, qtdQuartos: parseInt(e.target.value)})}
          />
          <label htmlFor="qtdSuites">Quantidade de Suites:</label>
          <input
            type="Number"
            id="qtdSuites"
            value={imovel.qtdSuites}
            onChange={(e) => setImovel( { ...imovel, qtdSuites: parseInt(e.target.value)})}
          />
          <label htmlFor="qtdSalasDeEstar">Quantidade de Salas de Estar:</label>
          <input
            type="Number"
            id="qtdSalasDeEstar"
            value={imovel.qtdSalasDeEstar}
            onChange={(e) => setImovel( { ...imovel, qtdSalasDeEstar: parseInt(e.target.value)})}
          />
          <label htmlFor="qtdSalasDeJantar">Quantidade de Salas de Jantar:</label>
          <input
            type="Number"
            id="qtdSalasDeJantar"
            value={imovel.qtdSalasDeJantar}
            onChange={(e) => setImovel( { ...imovel, qtdSalasDeJantar: parseInt(e.target.value)})}
          />
          <label htmlFor="nVagasGaragem">Numero de vagas garagem:</label>
          <input
            type="Number"
            id="nVagasGaragem"
            value={imovel.nVagasGaragem}
            onChange={(e) => setImovel( { ...imovel, nVagasGaragem: parseInt(e.target.value)})}
          />

          <label htmlFor="area">Area: </label>
          <input
            type="Number"
            id="area"
            value={imovel.area}
            onChange={(e) => setImovel( { ...imovel, area: parseInt(e.target.value)})}
          />

          <label htmlFor="armarioEmbutido">Possui armario embutido: </label>
          <select type = "Number" id = "armarioEmbutido" value = {imovel.armarioEmbutido} onChange = {(e) => setImovel( { ...imovel, armarioEmbutido: parseInt(e.target.value)})}>
            <option value = {0}>Sim</option>
            <option value = {1}>Nao</option>
          </select>

          <label htmlFor="disponibilidade">Disponibilidade: </label>
          <select type = "Text" id="disponibilidade" value={imovel.disponibilidade} onChange={(e) => setImovel( { ...imovel, disponibilidade: e.target.value})}>
            <option value='Venda'>Venda</option>
            <option value='Aluguel'>Aluguel</option>
          </select>
          
          <label htmlFor="bairro">Bairro: </label>
          <input
            type="Text"
            id="bairro"
            value={imovel.bairro}
            onChange={(e) => setImovel( { ...imovel, bairro: e.target.value})}
          />

          <label htmlFor="rua">Rua: </label>
          <input
            type="Text"
            id="rua"
            value={imovel.rua}
            onChange={(e) => setImovel( { ...imovel, rua: e.target.value})}
          />

          <label htmlFor="nCasa">Numero casa: </label>
          <input
            type="Number"
            id="nCasa"
            value={imovel.nCasa}
            onChange={(e) => setImovel( { ...imovel, nCasa: parseInt(e.target.value)})}
          />

          <label htmlFor="valor">Valor: </label>
          <input
            type="Number"
            id="valor"
            value={imovel.valor}
            onChange={(e) => setImovel( { ...imovel, valor: parseFloat(e.target.value)})}
          />

          <label htmlFor="descricao">Descricao: </label>
          <input
            type="Text"
            id="descricao"
            value={imovel.descricao}
            onChange={(e) => setImovel( { ...imovel, descricao: e.target.value})}
          /> 
          
          <label htmlFor="andar">Andar: </label>
          <input
            type="Number"
            id="andar"
            value={imovel.andar}
            onChange={(e) => setImovel( { ...imovel, andar: parseInt(e.target.value) })}
          />

          <label htmlFor="valorCondominio">Valor do Condominio: </label>
          <input
            type="Number"
            id="valorCondominio"
            value={imovel.valorCondominio}
            onChange={(e) => setImovel( { ...imovel, valorCondominio: parseFloat(e.target.value) })}
          />
          <label htmlFor="portaria24h">Possui portaria 24 horas: </label>
          <select type = "Number" id = "portaria24h" value = {imovel.portaria24h} onChange = {(e) => setImovel( { ...imovel, portaria24h: parseInt(e.target.value)})}>
            <option value = {0}>Sim</option>
            <option value = {1}>Nao</option>
          </select>

          
          {/* Adicione outros campos para o tipo 3 */}
        </>
      )}

      {imovel.idTipo === 3 && (
        <>
          <label htmlFor="area">Área:</label>
          <input
            type="text"
            id="area"
            value={imovel.area}
            onChange={(e) => setImovel(e.target.value)}
          />
          {/* Adicione outros campos para o tipo 4 */}
        </>
      )}

      {/* Botão de enviar o formulário */}
      <button type="submit" onClick={handleSubmit}>Enviar</button>
    </div>
  );
}