calculaValor :: Integer -> Double
calculaValor tempo  | tempo == 0 = 500
                    | tempo >= 1 = 1.05 * calculaValor(tempo-1)