Algoritmo LeerNumero
	Definir nnn ,a ,b, i Como Entero
	// a = 0 y b = 1
	a = 0
	b = 1

	Escribir "Ingresa el Número: "
	//leer el valor de nnn
	leer nnn
	
	
	para i = 1 Hasta nnn Con Paso 1 Hacer
		//imprimir valor de a 
		Escribir "Valor de a: " a  
		
		// a a b y b a a + b
		a = b
		b = a + b
		
	FinPara
FinAlgoritmo
