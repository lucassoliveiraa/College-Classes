potencia :: Float -> Float -> Float 
potencia base exp | exp == 0 = 1
                    | exp > 0 = base * potencia base (exp-1)
                    | otherwise  = 1/potencia base (-exp)

main :: IO()
main = do 
    putStrLn "Número base: "
    base <- readLn 

    putStrLn "Número expoente: "
    expo <- readLn 

    putStrLn("A potencia de " ++ show(potencia base expo))