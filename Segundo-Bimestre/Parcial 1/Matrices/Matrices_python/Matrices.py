def imprimirmatriz(matriz, filas, columnas):
    for i in range(filas):
        for j in range (columnas):
            print(matriz[i][j], end="   ")
        print()

matriz = [ 
            [4, 7, 10, -1],
            [9, 12, 24, 30],
            [10, 8, 6, 1],
         ]
imprimirmatriz(matriz, 3, 4)