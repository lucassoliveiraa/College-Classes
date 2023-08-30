dobro :: Int -> Int
dobro num = num * 2

triplo :: Int -> Int 
triplo num = num * 3

main :: IO()
main = do

    putStrLn "Digite um número: "
    num <- readLn

    if num >= 0 then 
        print(dobro num)
    else 
        print(triplo num)