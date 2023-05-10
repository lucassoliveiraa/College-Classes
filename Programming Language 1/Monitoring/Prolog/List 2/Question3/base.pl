esporte(tenis).
esporte(natacao).

jogo(xadrez).
jogo(damas).

homem(joao).
mulher(maria).
mulher(ana).

pessoa(X) :- homem(X).
pessoa(X) :- mulher(X).

animal(gato).
animal(cao).
animal(tigre).

moradia(casa).
moradia(apartamento).

mora_em(joao, casa).
mora_em(maria, apartamento).
mora_em(ana, apartamento).

gosta_de(joao, esporte).
gosta_de(joao, jogo).
gosta_de(maria, jogo).
gosta_de(maria, animal).
gosta_de(ana, animal).
gosta_de(ana, tigre).
gosta_de(ana, tenis).