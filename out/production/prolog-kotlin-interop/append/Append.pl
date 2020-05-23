append([], List, List).
append([Head|Tail], List, [Head|Result]) :- append(Tail, List, Result).
