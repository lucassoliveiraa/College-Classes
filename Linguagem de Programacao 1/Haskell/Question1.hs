soma :: Int -> Int
soma n = if n == 1 then 1
            else soma(n - 1) + n

main :: IO()
main = do
    putStrLn("Digite o numero: ")
    num <- readLn

    putStrLn("Soma: " ++ show(soma num))
