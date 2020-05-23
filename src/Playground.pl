abc(1, 2, 3).
abc(1, 3, 2).

heap :-
    singleton_heap(Heap0, 2, hello),
    add_to_heap(Heap0, 1, world, Heap1),
    add_to_heap(Heap1, 3, something, Heap2),
    writeln(Heap2).
