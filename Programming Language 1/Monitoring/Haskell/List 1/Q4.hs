mult :: Int -> Int -> Int
mult a b = a * b

soma :: Int -> Int -> Int 
soma a b = a + b

main :: IO()
main = do

    putStrLn "Digite a: "
    a <- readLn

    putStrLn "Digite b: "
    b <- readLn

    if a == b then do 
        let d = soma a b
        putStrLn ("A soma: " ++ show d)

    else do
        let d = mult a b 
        putStrLn ("A multiplicação:  " ++ show d)