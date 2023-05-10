colega(Pessoa1, Pessoa2) :- 
aluno(Pessoa1, Disciplina), aluno(Pessoa2, Disciplina), Pessoa1 \= Pessoa2;
frequenta(Pessoa1, Univ), frequenta(Pessoa2, Univ), Pessoa1 \= Pessoa2;
funcionario(Pessoa1, Univ), funcionario(Pessoa2, Univ), Pessoa1 \= Pessoa2.