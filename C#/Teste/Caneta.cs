class Caneta {
    public string Modelo {get; set;}
    public string Cor {get; set;}
    public float Ponta {get; set;}
    protected int Carga {get; set;}
    private bool Tampada {get; set;}

    public Caneta(string modelo, string cor, float ponta) {
        this.Modelo = modelo;
        this.Cor = cor;
        this.Ponta = ponta;
        this.Carga = 100;
        this.Tampar();
    }

    public void Rabiscar() {
        if (this.Tampada) {
            Console.WriteLine("Caneta tampada não rabisca!");
        } else {
            Console.WriteLine("Rabiscando...");
        }
    }
    public void Status() {
        Console.WriteLine("Modelo: " + this.Modelo);
        Console.WriteLine("Cor: " + this.Cor);
        Console.WriteLine("Ponta: " + this.Ponta + "mm");
        Console.WriteLine("Carga: " + this.Carga + "%");
        Console.WriteLine("Tampada: " + this.Tampada);
    }
    public void Tampar() {
        this.Tampada = true;
    }
    public void Destampar() {
        this.Tampada = false;
    }
}