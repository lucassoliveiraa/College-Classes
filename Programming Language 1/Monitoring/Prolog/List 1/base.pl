progenitor(maria, jose).
progenitor(joao, jose).
progenitor(joao, ana).
progenitor(jose, julia).
progenitor(jose, iris).
progenitor(iris, jorge).

avo(X, Y) :- progenitor(X, Y), progenitor(Y, X).
irmao(X, Y) :- progenitor(Z, X), progenitor(Z, Y), X\=Y.
/*Questao2 
    progenitor(ana, jorge).
Questao 3:
    progenitor(X, iris).
Questao 4:
    progenitor(X, jose).
Questao 5:
    progenitor(X, Y).
Questao 6:
    progenitor(X, jorge), progenitor(Y, X).
Questao 7:
    progenitor(joao, X), progenitor(X, Y).
Questao 8:
    progenitor(X, jose), progenitor(X, ana)
*/
