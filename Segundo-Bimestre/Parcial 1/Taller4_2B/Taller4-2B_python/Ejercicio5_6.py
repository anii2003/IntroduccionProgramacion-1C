print("")

# Inicializar las variables
k = 0; n = 0; i = 0; j = 0; q = 0; g = 0; rd = 0

Disp = []

k = int(input("Ingrese el número de góndolas: "))
n = int(input("Ingrese el número de anaqueles: "))

i = 0; j = 0

for i in range (0, k):
    Disp.append([])
    for j in range (0, n):
        valor = int(input("Disp["+str(i)+"]["+str(j)+"]: "))
        Disp[i].append(valor)

# Se hace el chequeo de la disponibilidad
# Del anaquel q en la góndola g

q = int(input("Ingrese el anaquel (q) a evaluar: "))
g = int(input("Ingrese la góndola (g) que necesita comprobar: "))

# Crear la función y usarla en el proces

def FunDisp (Disp, g, q):
    
    if (Disp[g][q] == 0):
        return 0

    else:
        return 1        

rd = FunDisp(Disp, g, q)

if (rd == 0):
    print("El anaquel ",q," en la góndola ",g," está disponible")
else:
    print("El anaquel ",q," en la góndola ",g," NO está disponible")