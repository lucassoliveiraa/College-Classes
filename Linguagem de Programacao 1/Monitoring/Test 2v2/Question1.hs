gerenciarComissao :: Double -> Double 
gerenciarComissao valor | valor < 10000 = valor * 0.3 
                        | valor >= 10000 && valor < 50000 = valor * 0.4
                        | otherwise = valor * 0.5