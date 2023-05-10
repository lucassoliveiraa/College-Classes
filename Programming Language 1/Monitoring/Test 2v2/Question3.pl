aluno(pedro).
aluno(joao).
aluno(lucas).
aluno(taina).

disciplina(linguagem_de_programacao1).
disciplina(estrutura_de_dados).
disciplina(banco_de_dados1).

carga_horaria(linguagem_de_programacao1, 60).
carga_horaria(estrutura_de_dados, 60).
carga_horaria(banco_de_dados1, 60).

frequencia(pedro, linguagem_de_programacao1, 0.8).
frequencia(joao, linguagem_de_programacao1, 0.2).
frequencia(lucas, estrutura_de_dados, 1).
frequencia(taina, banco_de_dados1, 0.1).

nota(pedro, linguagem_de_programacao1, 2).
nota(joao, linguagem_de_programacao1, 4).
nota(lucas, estrutura_de_dados, 9).
nota(taina, banco_de_dados1, 7).

aprovado(Aluno, Disciplina) :- 
    nota(Aluno, Disciplina, Nota),
    frequencia(Aluno, Disciplina, Frequencia),
    Nota >= 7,
    Frequencia >= 0.25. 

reprovado(Aluno, Disciplina) :-
    nota(Aluno, Disciplina, Nota),
    frequencia(Aluno, Disciplina, Frequencia),
    (Nota < 3; Frequencia < 0.25).

recuperacao(Aluno, Disciplina) :- 
    nota(Aluno, Disciplina, Nota),
    frequencia(Aluno, Disciplina, Frequencia),
    Nota >= 3, 
    Nota < 7, 
    Frequencia >= 0.25.