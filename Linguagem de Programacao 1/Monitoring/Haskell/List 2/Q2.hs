numDigitos :: Int -> Int 
numDigitos num = if num >= 0 && num < 10 then 1
                    else 1 + numDigitos(div num 10)

-- 1 = 100 -> numD(num/10)
-- 2 = 10  -> numD(num/10)
-- 3 = 1 
main :: IO()
main = do 

    putStrLn "Digite um numero positivo: "
    n <- readLn

    let numero = numDigitos n

    putStrLn ("O número tem " ++ show numero)
