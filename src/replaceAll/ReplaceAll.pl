replace_all([], _, _, []).
replace_all([Y|T], Y, Z, [Z|Result]) :- replace_all(T, Y, Z, Result).
replace_all([H|T], Y, Z, [H|Result]) :- replace_all(T, Y, Z, Result).
