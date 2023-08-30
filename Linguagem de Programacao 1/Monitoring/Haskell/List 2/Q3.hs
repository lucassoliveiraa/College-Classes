mdc :: Integer -> Integer -> Integer
mdc a b  | mod a b == 0 = b
            | mod b a == 0 = a
            | a > b = mdc b (mod a b)
            | a < b = mdc a (mod b a)

-- 1: 6/4 = 2 
-- 2: mdc 4 (mod 6 4)
-- 3: mdc 4 2
-- 4: 0
main :: IO()
main = do 

    putStrLn "Digite o primeiro valor"
    a <- readLn 
    putStrLn "Digite o segundo valor"
    b <- readLn 

    putStrLn("O md dos dois valores é: " ++ show(mdc a b))

