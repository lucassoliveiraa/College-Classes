ePar :: Int -> Int
ePar num = num + 5

eImpar :: Int -> Int 
eImpar num = num + 8

main :: IO()
main = do

    putStrLn "Digite um número: "
    num <- readLn

    if even num then 
        print(ePar num)
    else 
        print(eImpar num)