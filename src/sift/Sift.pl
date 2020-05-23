sift([], []).
sift([H|T], [H|Result]) :- H > 6, sift(T, Result).
sift([_|T], Result) :- sift(T, Result).
