desconto_salario :: Float -> Float
desconto_salario n = if n == 1212.00 then (n * 7.5)/100
                        else if n >= 1212.01 && n <= 2427.35 then (n * 9)/100
                            else if n >= 2427.36 && n <= 3641.03 then (n * 12)/100
                                else if n >= 3641.04 && n <= 7087.22 then (n * 14)/100
                                    else n * 0
sal_bruto :: Float -> Float
sal_bruto n = n

sal_liquido :: Float -> Float
sal_liquido n = if n == 1212.00 then n - ((n * 7.5)/100)
                    else if n >= 1212.01 && n <= 2427.35 then n - ((n * 9)/100)
                        else if n >= 2427.36 && n <= 3641.03 then n - ((n * 12)/100)
                            else if n >= 3641.04 && n <= 7087.22 then n - ((n * 14)/100)
                                else n 

main :: IO()
main = do
    putStrLn("Digite o nome: ")
    nome <- getLine
    putStrLn("Digite seu salario: ")
    salario <- readLn

    putStrLn("Nome do funcionario: " ++ nome)
    putStrLn("Salario Bruto: R$" ++ show(sal_bruto salario))
    putStrLn("Desconto: R$" ++ show(desconto_salario salario))
    putStrLn("Salario Liquido: R$" ++ show(sal_liquido salario))
