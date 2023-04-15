soma :: Int -> Int 
soma n = if n == 1 then 1
            else n + soma(n - 1)

-- 1 = 5 + soma(5)
-- 2 = 4 + soma(3)
-- 3 = 3 + soma(2)
-- 4 = 2 + soma(1)
-- 5 = 1
main :: IO()

main = do

    putStrLn "Digite o número: "
    num <- readLn 

    putStrLn ("Soma: " ++ show(soma num))