using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int x;
            
            float y;
            
            double z;
            byte b = 250;
            sbyte b2 = -20;
            char caracter = 'e';
            bool condicion = true;

            String cadena = "Hola";

            //Operadores + , - , * ,/ %

            if (b > 10)
            {

            }
            else if (b > 5)
            {

            }
            else
            {

            }

            char opcion = 'a';

            switch (opcion)
            {
                case 'a':
                    break;
                case 'b':
                    break;
                default:
                        break;

            }


            //Conversión de variables:
            short c = 34;
            Byte cb = (byte)c;

            Int32 numero = 56;
            Int16 numeroShort = Convert.ToInt16(numero);
            Single numeroDecimal = Convert.ToSingle(numero);





        }
    }
}
