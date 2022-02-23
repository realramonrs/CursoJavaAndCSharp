using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MiPrimeraAppGrafica
{
    public partial class Form1 : Form
    {
        String dni;
        String nombre;
        float salario;
        DateTime fechaNacimiento;
        String telefono;
        public Form1()
        {
            InitializeComponent();
        }

        private void btnGuardarDatos_Click(object sender, EventArgs e)
        {
            try
            {
                dni = txtDNI.Text;
                nombre = txtNombre.Text;
                salario = Convert.ToSingle(txtSalario.Text);
                fechaNacimiento = dtpFechaNac.Value;
                telefono = txtTelefono.Text;

                //Comprobar DNI
                if (dni.Length != 9)
                {
                    MessageBox.Show("DNI con formato erróneo");
                    txtDNI.BackColor = Color.Coral;
                    txtDNI.Focus();
                    txtDNI.SelectAll();
                }
                else
                {
                    MessageBox.Show("Sus datos están a salvo.");
                }
            }

            catch(Exception ex)
            {
                MessageBox.Show("Revise el formulario.");
            }    

           
            

        }

        private void btnGuardarDatos_MouseEnter(object sender, EventArgs e)
        {

        }
    }
}
