delete_all([], _, []).
delete_all([Y|T], Y, Result) :- delete_all(T, Y, Result).
delete_all([H|T], Y, [H|Result]) :- delete_all(T, Y, Result).
