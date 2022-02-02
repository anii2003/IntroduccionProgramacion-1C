print("")

try:
    nota1 = 9
    nota2 = 0
    notaFinal = nota1/nota2
    print("La nota final es: "+notaFinal)

except ZeroDivisionError as ExpresionAritmetica:
    print("Lo sentimos hay un error")
    print("de tipo",ExpresionAritmetica)
    print("")