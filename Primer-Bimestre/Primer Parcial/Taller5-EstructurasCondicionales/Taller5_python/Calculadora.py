print("")
print("***Programa con calculadora de 4 operaciones básicas")
print("")

# Inicializar las variables
num1 = 0; num2 = 0; resp = 0; opc = 0

# Ingresar los datos
print("Calculadora básica \n")
print("")
num1 = float(input("Ingrese el valor del primer número: "))
num2 = float(input("Ingrese el valor del segundo número: "))
print("")
print("Escoja la opción del siguiente menú")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("")

opc = int(input("Ingrese el valor del primer número: "))

if (opc == 1):
    resp = num1 +num2
    print("La suma es: " ,resp)
    
elif (opc == 2):
    resp = num1 - num2
    print("La resta es: " ,resp)

elif (opc == 3):
    resp = num1 * num2
    print("La multiplicación es: " ,resp)

elif (opc == 4):
    resp = num1 / num2
    print("La división es: " ,resp)

else:
    print("No existe la opción que usted ingresó")

print("")