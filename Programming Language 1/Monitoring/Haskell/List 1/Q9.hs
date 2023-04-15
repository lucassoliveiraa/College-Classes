pesoIdeal :: Float -> Char -> Float
pesoIdeal altura sexo = if sexo == 'H' then 
                            (72.7 * altura) - 50
                        else 
                            (62.1 * altura) - 44.7


main :: IO()
main = do 
    putStrLn "Digite sua altura: "
    altura <- readLn

    putStrLn "Digite seu sexo: H - Homem | M - Mulher"
    sexo <- getChar

    putStrLn("Seu peso ideal é " ++ show(pesoIdeal altura sexo))