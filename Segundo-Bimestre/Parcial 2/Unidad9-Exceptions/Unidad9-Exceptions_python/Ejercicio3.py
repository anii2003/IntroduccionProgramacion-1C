print("")
# Inicializar las variables
valor1 = 0; valor2 = 0; resultado = 0

# Proceso
try:
    valor1 = int(input("Ingrese el valor 1: ")) 
    valor2 = int(input("Ingrese el valor 2: ")) 

    resultado = valor1/valor2

    print("El resultado es: ",resultado)

except ZeroDivisionError as ExpresionAritmetica:
    print("")
    print("Lo sentimos hay un error")
    print("de tipo",ExpresionAritmetica)
    print("")

except ValueError as ExcepcionErrorEntrada:
    print("")
    print("Existe un error en la entrada de datos")
    print("de tipo",ExcepcionErrorEntrada)
    print("")