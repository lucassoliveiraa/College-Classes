fibo :: Integer -> Integer
fibo num | num == 0 = 0
        | num == 1 = 1
        | num > 1 = fibo(num-1) + fibo(num-2) + 1

