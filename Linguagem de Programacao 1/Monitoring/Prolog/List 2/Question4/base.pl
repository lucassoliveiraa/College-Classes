passaro(tweety).
peixe(goldie).
minhoca(molie).
gato(silvester).


gosta_de(X, Y) :- passaro(X), minhoca(Y).
gosta_de(X, Y) :- gato(X), peixe(Y).
gosta_de(X, Y) :- gato(X), passaro(Y).

amigo(X, Y) :- amigo(Y, X).
amigo(eu, silvester).

come(X, Y) :- gosta_de(X, Y).