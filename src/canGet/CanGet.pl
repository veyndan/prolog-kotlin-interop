link(town1, town2).
link(town2, town3).
link(town3, town4).
link(town4, town5).
link(town5, town6).

can_get(X, Y) :- link(X, Y).
can_get(X, Y) :-
    link(X, Z),
    can_get(Z, Y).
