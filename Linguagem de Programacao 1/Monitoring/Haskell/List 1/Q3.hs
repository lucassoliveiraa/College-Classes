imparPar :: Int -> IO()
imparPar num  = if even num then do 
                    putStrLn "Par"
                else do 
                    putStrLn "Ímpar"