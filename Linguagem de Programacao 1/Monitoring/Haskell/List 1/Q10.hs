imc :: Float -> Float -> IO()
imc peso altura | peso/(altura * altura) < 18.5 = putStrLn "Abaixo do peso"
                | peso/(altura * altura)  >= 18.5 && peso/(altura * altura) < 25 = putStrLn "Peso normal"
                | peso/(altura * altura)  >= 25 && peso/(altura * altura) < 30 = putStrLn "Acima do peso"
                | otherwise = putStrLn "Obeso"
main :: IO()
main = do 

    putStrLn "Digite o seu peso: "
    peso <- readLn

    putStrLn "Digite sua altura: "
    altura <- readLn

    imc peso altura