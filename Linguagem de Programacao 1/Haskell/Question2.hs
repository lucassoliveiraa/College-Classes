verifica_idade :: Int -> Bool
verifica_idade a = if a < 16 then False
                    else True


main :: IO()
main = do
    putStrLn("Idade: ")
    idade <- readLn
    
    if(verifica_idade idade == True) then putStrLn("Essa pessoa pode votar")
    else putStrLn("Essa pessoa nao pode votar")