print("")
# Inicializar las varibles
comb = 2525; i = 1; n = 4; comb1 = 0

while ((i <= n) & (comb != comb1)):
    comb1 = int(input("Por favor ingrese una combinación: "))

    if (comb1 == 2525):
        print("La caja se ha abierto satisfactoriamente")

    else:
        print("Lo siento, no es correcto")
    i = i + 1

    if ((i > n) & (comb != comb1)):
        print("La caja se bloqueó")
