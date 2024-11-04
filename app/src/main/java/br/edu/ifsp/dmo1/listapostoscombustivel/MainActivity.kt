package br.edu.ifsp.dmo1.listapostoscombustivel

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.dmo1.listapostoscombustivel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnItemClickListener {
    private lateinit var datasource: List<GasStation>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadDatasource()
        configListview()
    }

    private fun configListview() {
        val adapter = GasStationAdapter(this, datasource)

        binding.gasStationListview.adapter = adapter
        binding.gasStationListview.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val gasStation = datasource.get(position)
        Toast.makeText(this,
            "Gasolina: R$ ${gasStation.gas}\nEtanol: R$ ${gasStation.etha}",
            Toast.LENGTH_LONG)
            .show()
    }

    private fun loadDatasource() {
        datasource = ArrayList<GasStation>(10).apply {
            add(GasStation("Rede 7", "Carmo", 5.59, 3.79))
            add(GasStation("Balao da 36", "São Geraldo", 5.99, 3.99))
            add(GasStation("Faveral", "Carmo", 5.49, 3.59))
            add(GasStation("Pau Seco", "Rodovia", 6.29, 4.19))
            add(GasStation("Posto da 16", "Santana", 5.67, 3.67))
            add(GasStation("Posto do Fu", "Jabotical", 5.59, 3.69))
            add(GasStation("Quitandinha", "Quitandinha", 5.99, 3.99))
            add(GasStation("Piramide", "Vila Ferroviária", 4.99, 2.99))
            add(GasStation("Monaco", "Expressa", 5.01, 3.01))
            add(GasStation("Pantanal (Shell)", "Fonte", 5.99, 4.19))
            add(GasStation("Rede 7", "Carmo", 5.59, 3.79))
            add(GasStation("Balao da 36", "São Geraldo", 5.99, 3.99))
            add(GasStation("Faveral", "Carmo", 5.49, 3.59))
            add(GasStation("Pau Seco", "Rodovia", 6.29, 4.19))
            add(GasStation("Posto da 16", "Santana", 5.67, 3.67))
            add(GasStation("Posto do Fu", "Jabotical", 5.59, 3.69))
            add(GasStation("Quitandinha", "Quitandinha", 5.99, 3.99))
            add(GasStation("Piramide", "Vila Ferroviária", 4.99, 2.99))
            add(GasStation("Monaco", "Expressa", 5.01, 3.01))
            add(GasStation("Pantanal (Shell)", "Fonte", 5.99, 4.19))
        }
    }
}