ordemCrescente :: Int -> Int -> Int -> (Int, Int, Int)
ordemCrescente x y z | x < y && y < z = (x, y, z)
                        | x < z && z < y = (x, z, y)
                        | y < x && x < z = (y, x, z)
                        | y < z && z < x = (y, z, x)
                        | z < x && x < y = (z, x, y)
                        | otherwise = (z, y, x)


main :: IO()
main = do
    putStrLn "Entre com três valores: "
    a <- readLn
    b <- readLn
    c <- readLn

    putStrLn("Ordem Crescente: " ++ show(ordemCrescente a b c))

