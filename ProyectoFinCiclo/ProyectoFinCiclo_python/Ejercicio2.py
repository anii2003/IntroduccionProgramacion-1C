"""""Leer dos matrices 5x5 enteras y determinar si el promedio entero de los números
terminados en 4 de una matriz se encuentra al menos 3 veces en la otra matriz"""

# Inicializar las variables
n = 5; prom = 0; dig = 0; suma = 0; k = 0; l = 0; Pdec = 0

# Declarar las matrices
A = []
B = []

# Ingresar los elementos de la matriz A
print("\nIngresar los elementos de la matriz A:")
for i in range (0, n):
    A.append([])
    for j in range (0, n):
        valor = int(input("A["+str(i)+"]["+str(j)+"]: "))
        A[i].append(valor)

# Ingresar los elementos de la matriz B
print("\nIngresar los elementos de la matriz B:")
for i in range (0, n):
    B.append([])
    for j in range (0, n):
        valor = int(input("B["+str(i)+"]["+str(j)+"]: "))
        B[i].append(valor)

# Mostrar la matriz A
print("\nMATRIZ A")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="\t")
    print("")

# Mostrar la matriz B
print("\nMATRIZ B")
for i in range (0, n):
    for j in range (0, n):
        print(B[i][j], end="\t")
    print("")

# Determinar cuáles números terminan en 4 y promedio de los mismos
for i in range (0, n):
    for j in range (0, n):
        dig = A[i][j] % 10

        if (dig == 4):
            print("A["+str(i)+"]["+str(j)+"] termina en 4")
            k = k + 1
            suma = suma + A[i][j]
        
        prom = suma / k

        # Si el promedio es decimal su operación con la función MOD
        # dará diferente de 0, por tanto solo tomaremos la parte entera.

        if (prom % 1 != 0):
            Pdec = prom % 1
            prom = prom - Pdec
    
print("El promedio de los números terminados en 4 es: ",prom)

# Verificar si este promedio entero se encuentra al menos 3 veces en la matriz B
for i in range (0, n):
    for j in range (0, n):
        if (B[i][j] == prom):
            l = l + 1
    
print("El promedio entero ",prom," se ha encontrado ",l," veces en la matriz B")

if (l >= 3):
    print("El promedio de los números terminados en 4 de la matriz A SÍ se repiten al menos 3 veces")
else:
    print("El promedio de los números terminados en 4 de la matriz A NO se repiten al menos 3 veces")