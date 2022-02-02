print("")
# ****Método principal*****

# Inicializar las variables
num = 0
bandera = True and False

# Ingresar los datos
print("Procedimiento para verificar si un número es positivo o negativo")
num = int(input("Ingrese el número a verificar: "))

# **** Función desarrollada ****
def funNegPos (numero):
    if (numero > 0):
        return True
    else:
        return False

# Asignar el valor que devuelve la función
band = funNegPos(num)

# Comprobar directamente con el llamado a la función
print("")

if (funNegPos(num) == True):
    print("El número ",num," es positivo")
else:
    print("El número ",num," es negativo")

print("*** Fin de función 1 ***\n")

# Comprobar directamente con el llamado a la función
if (funNegPos(num) == True):
    print("El número ",num," es positivo 1")
else:
    print("El número ",num," es negativo 1")

print("*** Fin de función 2 ***\n")