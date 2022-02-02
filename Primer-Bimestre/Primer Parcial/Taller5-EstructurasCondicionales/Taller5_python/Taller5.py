print("")
print("***Conversión de hora: de 24 horas a 12 horas*** \n")

#Inicializar las variables

h24 = 0; m24 = 0; h12 = 0; m12 = 0
periodo = "a.m"

# Datos de entrada

h24 = int(input("Ingrese la hora en formato 24: "))
m24 = int(input("Ingrese los minutos en formato 24h: "))
print("")

# Proceso

if (((h24 <= 24) & (h24 >= 0)) & ((m24 >= 0) & (m24 <= 60))):
    if (m24 == 60):
        h24 = h24 + 1
        m24 = 0

    else:
        m12 = m24

    if (h24 > 12):
        h12 = h24 - h12
        periodo = " p.m"
        print("El tiempo de ",h24," horas y ",m24," minutos \n"
            + "equivale a " ,h12 ," horas y " ,m12 ," minutos" ,periodo)
        print("")

    else: 
        h12 = h24
        print("El tiempo de ",h24," horas y ",m24," minutos \n"
                ,"equivale a ",h12," horas y ",m12," minutos ",periodo)
        print("")
        
else: 
    print("Error : la hora o los minutos ingresados no son válidos")
    print("")
    
