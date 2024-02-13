main :: IO()
main = do 
    putStrLn "Digite o seu nome"
    nome <- getLine

    putStrLn "Digite seu sexo (M - Masculino e F - Feminino)"
    sexo <- getLine

    putStrLn "Estado civil (solteira | casada)"
    civil <- getLine

    if sexo=="F" && civil=="casada" then do
        putStrLn "Digite o tempo de casada" 
        tempo <- getLine
        putStrLn (nome ++ " você é casada a " ++ tempo ++ " anos")
    else do 
        putStrLn (nome ++ " voce é do sexo " ++ sexo ++ " e é " ++ civil)
