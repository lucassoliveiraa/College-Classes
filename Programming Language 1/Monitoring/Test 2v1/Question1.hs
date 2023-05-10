gerenciarPagamento :: Integer -> Double -> Double
gerenciarPagamento idade valorPassagem  | idade >= 0 && idade <= 2 = valorPassagem * 0.1
                                        | idade > 2 && idade <= 10 = valorPassagem * 0.5
                                        | idade >= 60 = valorPassagem * 0.6
                                        | otherwise = valorPassagem
