height(bob, mike).
height(mike, jim).
height(jim, george).

taller_than(Taller, Shorter) :- height(Taller, Shorter).
taller_than(Taller, Shorter) :-
    height(Taller, Shorter2),
    taller_than(Shorter2, Shorter).
