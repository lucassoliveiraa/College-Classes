
media :: Float -> Float -> Float -> Float -> Float 
media a b c d = (a + (b * 2) + (c * 3) + d)/7  

conceito :: Float -> String
conceito m | m >= 9.0 = "A"
            | m >= 7.5 && m < 9.0 = "B"
            | m >= 6.0 && m < 7.5 = "C"
            | m >= 4.0 && m < 6.0= "D"
            | otherwise = "E"

main :: IO()
main = do 
    putStrLn "Digite o número de identificação do aluno:"
    id_aluno <- getLine

    putStrLn "Digite a 1ª nota: "
    nota1 <- readLn 

    putStrLn "Digite a 2ª nota:"
    nota2 <- readLn 

    putStrLn "Digite a 3ª nota: "
    nota3 <- readLn 

    putStrLn "Digite a média dos exercícios:"
    me <- readLn 

    let mediaFinal = media nota1 nota2 nota3 me 

    let conceitoNota = conceito mediaFinal

    putStrLn ("Número do aluno: " ++ show id_aluno)
    putStrLn ("Notas: " ++ show nota1 ++ ", " ++ show nota2 ++ ", " ++ show nota3)
    putStrLn ("Média dos exercícios: " ++ show me)
    putStrLn ("Média de aproveitamento: " ++ show mediaFinal)
    putStrLn ("Conceito: " ++ conceitoNota)
    if conceitoNota == "A" || conceitoNota == "B" || conceitoNota == "C" then putStrLn "Aprovado"
        else putStrLn "Reprovado"