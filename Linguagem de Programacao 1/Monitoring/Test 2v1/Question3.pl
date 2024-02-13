vencedor(x, X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3) :- 
        X1 = x, X2 = x, X3 = x;
        Y1 = x, Y2 = x, Y3 = x;
        Z1 = x, Z2 = x, Z3 = x;
        X1 = x, Y2 = x, Z3 = x;
        X3 = x, Y2 = x, Z1 = x;
        X1 = x, Y1 = x, Z1 = x;
        X2 = x, Y2 = x, Z2 = x;
        X3 = x, Y3 = x, Z3 = x.

vencedor(o, X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3) :- 
        X1 = o, X2 = o, X3 = o;
        Y1 = o, Y2 = o, Y3 = o;
        Z1 = o, Z2 = o, Z3 = o;
        X1 = o, Y2 = o, Z3 = o;
        X3 = o, Y2 = o, Z1 = o;
        X1 = o, Y1 = o, Z1 = o;
        X2 = o, Y2 = o, Z2 = o;
        X3 = o, Y3 = o, Z3 = o.
