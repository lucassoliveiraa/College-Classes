vista :: Double -> String -> Double 
vista valor formaPag | formaPag == "d" || formaPag == "h" = valor - (valor * 10/100)
                     | formaPag == "c" = valor - (valor * 15/100)
                     | otherwise = -1.0

prazo :: Double -> Int -> Double
prazo valor quant | quant >= 1 && quant <= 2 = valor
                  | quant > 2 = valor + (valor * 10/100)

main :: IO()
main = do 

    putStrLn "Digite o valor: "
    valor <- readLn

    putStrLn "Forma de pagamento: a vista ou a prazo (Vista - v | Prazo - p) "
    comoPag <- getLine


    if comoPag == "v"
        then do 
        putStrLn "Digite a forma de pagamento (Dinheiro - d | Cheque - h | Cartão - c) "
        formaPag <- getLine
        putStrLn ("Valor final = " ++ show(vista valor formaPag))

    else if comoPag == "p" 
        then do 
        putStrLn "Digite a quantidade de parcelas " 
        quant <- readLn
        let valorFinal = prazo valor quant 
        putStrLn ("Valor final = " ++ show(prazo valor quant) ++ " divido em " ++ show quant ++ " parcelas")

    else 
        putStrLn "Operação incorreta"