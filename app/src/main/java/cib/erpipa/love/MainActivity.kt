package cib.erpipa.love

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val titulo : CardView = findViewById(R.id.cvTitulo)
        val tvTitulo : TextView = findViewById(R.id.tvTitulo)
        val verFrase : CardView = findViewById(R.id.cvFrase)
        val btdescubrir : Button = findViewById(R.id.btDescubrir)
        val frase : TextView = findViewById(R.id.tvFrase)
        val logros : CardView = findViewById(R.id.cvLogros)
        val layout : ConstraintLayout = findViewById(R.id.main)
        val tvOdio : TextView = findViewById(R.id.tvOdio)
        val tvAmor : TextView = findViewById(R.id.tvAmor)
        val tvSubtitulo : TextView = findViewById(R.id.tvSubtitulo)

//        val amor : ImageButton = findViewById(R.id.ibAmor)
//        val volver : ImageButton = findViewById(R.id.ibVolver)

        val frasesRomanticas = listOf(
            "Eres lo mejor que me ha pasado en la vida.",
            "A tu lado, todo es más bonito.",
            "Cada día me enamoro un poco más de ti.",
            "Eres mi persona favorita en el mundo.",
            "No necesito nada más cuando estoy contigo.",
            "Mi lugar favorito siempre será a tu lado.",
            "Desde que llegaste, mi mundo es diferente.",
            "Eres la razón de muchas de mis sonrisas.",
            "Contigo, cada momento se vuelve especial.",
            "Si tuviera que elegir de nuevo, te elegiría a ti.",
            "Eres mi casualidad más bonita.",
            "Mi corazón siempre encuentra el camino hacia ti.",
            "No hay día en el que no me alegre de tenerte.",
            "Tú haces que lo cotidiano se convierta en algo mágico.",
            "Eres ese sueño que nunca quiero dejar de vivir.",
            "Mi felicidad tiene mucho que ver contigo.",
            "No sabía que podía querer tanto a alguien hasta que te conocí.",
            "Eres mi pensamiento favorito al despertar.",
            "Tu sonrisa es una de mis cosas favoritas.",
            "Quiero seguir escribiendo nuestra historia contigo.",
            "Te quiero más de lo que imaginas.",
            "Tú y yo, siempre que podamos.",
            "Eres mi felicidad.",
            "Contigo, sí a todo.",
            "Mi corazón te pertenece.",
            "Tú eres mi hogar.",
            "Qué bonito es coincidir contigo.",
            "Eres mi mejor elección.",
            "Te elegiría mil veces.",
            "Mi mundo empieza contigo.",
            "Eres mi persona especial.",
            "Tú haces que todo valga la pena.",
            "Siempre hay un motivo para quererte.",
            "Me encantas tal y como eres.",
            "Eres mi alegría favorita.",
            "Qué suerte tenerte.",
            "Tú eres mi lugar seguro.",
            "Me haces feliz sin darte cuenta.",
            "Eres mi mejor pensamiento.",
            "Te quiero hoy y todos los días.",
            "Me encanta cuando me abrazas.",
            "No cambiaría tus abrazos por nada del mundo.",
            "Me haces sentir querido de una manera especial.",
            "Ojalá pudiera abrazarte cada vez que te echo de menos.",
            "Me encanta compartir mis días contigo.",
            "Tu voz siempre consigue sacarme una sonrisa.",
            "Me gusta hasta la forma en la que dices mi nombre.",
            "Quiero ser esa persona que te haga sonreír en los días difíciles.",
            "Me encanta descubrir cosas nuevas de ti.",
            "Tus pequeños detalles significan mucho para mí.",
            "Me haces sentir que soy importante.",
            "Quiero cuidarte tanto como tú me haces feliz.",
            "Me encanta poder ser yo mismo cuando estoy contigo.",
            "Tus abrazos arreglan muchos de mis días malos.",
            "Me gusta mirarte incluso cuando no te das cuenta.",
            "Eres una de mis razones favoritas para sonreír.",
            "Quiero que nunca dudes de lo mucho que significas para mí.",
            "Me encanta pasar tiempo contigo, incluso sin hacer nada.",
            "Tu felicidad también es importante para mí.",
            "Gracias por ser parte de mi vida.",
            "No siempre encuentro las palabras adecuadas para explicarte cuánto te quiero.",
            "Lo que siento por ti es más grande de lo que puedo expresar.",
            "Quiero demostrarte con hechos todo lo que significas para mí.",
            "Tenerte en mi vida es algo que valoro cada día.",
            "No eres una persona más, eres alguien muy especial para mí.",
            "Quiero seguir aprendiendo a quererte de la manera que mereces.",
            "Me importas mucho más de lo que a veces consigo demostrar.",
            "Mi cariño por ti crece con cada experiencia que compartimos.",
            "Quiero estar a tu lado tanto en los días buenos como en los malos.",
            "Eres alguien a quien siempre quiero ver feliz.",
            "No necesito que seas perfecto para quererte.",
            "Me enamoran tanto tus virtudes como tus pequeñas imperfecciones.",
            "Quiero que sientas todo el amor que tengo por ti.",
            "Mi vida es más bonita desde que formas parte de ella.",
            "Eres una persona que quiero conservar en mi vida.",
            "Cada recuerdo contigo ocupa un lugar especial en mi corazón.",
            "Me gusta la persona que soy cuando estoy contigo.",
            "Quiero compartir contigo muchas más experiencias.",
            "Te quiero por quien eres y por lo que compartimos.",
            "No quiero dar por sentado lo afortunado que soy de tenerte.",
            "El amor no consiste en encontrar a alguien perfecto, sino en elegir a alguien con quien compartir la vida.",
            "Entre tantas personas, me alegra que nuestros caminos se hayan encontrado.",
            "No puedo prometerte una vida perfecta, pero sí quiero construir momentos bonitos contigo.",
            "Amar también significa escuchar, comprender y aprender juntos.",
            "Quiero que nuestro amor sea un lugar donde ambos podamos ser nosotros mismos.",
            "No necesito que todos los días sean extraordinarios si puedo compartirlos contigo.",
            "Lo más bonito de quererte es poder compartir contigo tanto las alegrías como las dificultades.",
            "El tiempo pasa, pero espero que nunca dejemos de cuidarnos.",
            "Quiero que sigamos creciendo juntos sin dejar de ser nosotros mismos.",
            "El amor está en los pequeños detalles que repetimos cada día.",
            "Quiero ser alguien con quien puedas contar cuando el mundo se vuelva complicado.",
            "Me gusta pensar en todo lo que todavía nos queda por vivir.",
            "Una de las mejores partes de mi vida es poder compartirla contigo.",
            "No necesito grandes promesas, me bastan los pequeños gestos sinceros.",
            "Quiero que nunca nos falten las ganas de conocernos un poco más.",
            "En ti he encontrado una persona con la que quiero compartir mis ilusiones.",
            "El amor también es elegirnos incluso cuando las cosas no son fáciles.",
            "Quiero que nuestros recuerdos sean tantos que siempre tengamos alguno que nos haga sonreír.",
            "No sé qué nos deparará el futuro, pero me hace ilusión imaginarlo contigo.",
            "Si algo tengo claro, es que me encanta tenerte en mi vida."
        )

        val frasesOdio = listOf(
            "A veces, quien más quieres es quien más daño te hace.",
            "Qué triste es convertirse en un extraño para alguien que lo fue todo.",
            "Me arrepiento de haber confiado tanto en ti.",
            "No me rompiste el corazón, me rompiste la confianza.",
            "Duele más la decepción que la despedida.",
            "Ojalá nunca hubiera confundido tus mentiras con amor.",
            "Me cansé de esperar algo que nunca llegó.",
            "Lo peor no fue perderte, sino perderme a mí por ti.",
            "Qué fácil fue para ti olvidar lo que para mí significaba todo.",
            "A veces, el silencio de alguien dice más que mil palabras.",
            "Hay personas que merecen convertirse en simples recuerdos.",
            "Llegué a quererte tanto como ahora deseo olvidarte.",
            "No te odio por lo que hiciste, sino por hacerme creer que eras diferente.",
            "Me enseñaste que no todo el mundo merece mi cariño.",
            "Ojalá algún día entiendas el daño que causaste.",
            "No vuelvas buscando el cariño que tú mismo destruiste.",
            "Hay heridas que llevan tu nombre y no quiero volver a abrir.",
            "Me cansé de justificar a quien nunca tuvo en cuenta mis sentimientos.",
            "No te deseo ningún mal; simplemente ya no te deseo en mi vida.",
            "Lo que antes me hacía feliz ahora me resulta indiferente.",
            "Tus palabras prometían amor, pero tus acciones demostraban lo contrario.",
            "No hay nada más triste que descubrir que todo era una mentira.",
            "Me pedías confianza mientras me dabas motivos para desconfiar.",
            "No fuiste sincero ni siquiera cuando te di la oportunidad de serlo.",
            "Las mentiras terminan convirtiendo el amor en sospecha.",
            "Me duele haber defendido a alguien que no merecía mi confianza.",
            "No hay disculpa que pueda devolverme la tranquilidad que perdí.",
            "Me prometiste para siempre y ni siquiera supiste cuidar el presente.",
            "Tu mayor error fue hacerme creer que nunca me harías daño.",
            "No todas las despedidas empiezan con un adiós; algunas empiezan con una mentira.",
            "Ya no siento la necesidad de saber de ti.",
            "Tu ausencia dejó de doler cuando aprendí a vivir sin ti.",
            "Ya no eres mi debilidad, eres una lección aprendida.",
            "No necesito odiarte para dejar de quererte.",
            "Llegó un momento en el que dejarte ir fue más fácil que seguir soportándolo.",
            "Ya no espero tus mensajes ni tus explicaciones.",
            "Lo que antes me importaba ahora ya no tiene lugar en mi vida.",
            "No eres la persona que recuerdo, sino la persona que me demostraste ser.",
            "Mi indiferencia es la respuesta a todo lo que no quisiste escuchar.",
            "No voy a perseguir a quien nunca tuvo intención de quedarse.",
            "Qué ironía que mi recuerdo favorito acabara convirtiéndose en mi peor pesadilla.",
            "Hay amores que dejan flores y otros que solo dejan cenizas.",
            "Te di las partes más bonitas de mí y me devolviste las más rotas.",
            "No todas las historias de amor merecen un final feliz.",
            "A veces, el corazón necesita cerrar la puerta que la razón lleva tiempo señalando.",
            "Fuiste mi lugar seguro hasta que te convertiste en mi mayor incertidumbre.",
            "Hay personas que te enseñan a amar y otras que te enseñan a no volver a hacerlo igual.",
            "Lo que un día fue nuestra historia ahora es algo que prefiero no recordar.",
            "Me costó aceptar que perderte también podía ser una forma de salvarme.",
            "Una vez dejé de idealizarte, entendí por qué necesitaba alejarme."
        )


        btdescubrir.setOnClickListener{

            val fraseFea = (1..100).random() <= 30

            if(fraseFea){
                frase.text = frasesOdio.random()
                verFrase.visibility = android.view.View.VISIBLE
                tvOdio.visibility = android.view.View.VISIBLE
                tvSubtitulo.visibility = android.view.View.GONE
                tvAmor.visibility = android.view.View.GONE
                // Tema oscuro
                btdescubrir.backgroundTintList =
                    android.content.res.ColorStateList.valueOf(
                        android.graphics.Color.BLACK
                    )

                layout.backgroundTintList = android.content.res.ColorStateList.valueOf(android.graphics.Color.BLACK)
                btdescubrir.setTextColor(
                    android.graphics.Color.WHITE
                )
            } else {
                frase.text = frasesRomanticas.random()
                verFrase.visibility = android.view.View.VISIBLE
                tvOdio.visibility = android.view.View.GONE
                tvAmor.visibility = android.view.View.VISIBLE
                // Tema romántico
                btdescubrir.backgroundTintList =
                    android.content.res.ColorStateList.valueOf(
                        android.graphics.Color.MAGENTA
                    )
                layout.backgroundTintList = android.content.res.ColorStateList.valueOf(android.graphics.Color.MAGENTA)
                btdescubrir.setTextColor(
                    android.graphics.Color.WHITE
                )
            }



        }

//        amor.setOnClickListener {
//            titulo.visibility = android.view.View.GONE
//            verFrase.visibility = android.view.View.GONE
//            btdescubrir.visibility = android.view.View.GONE
//            logros.visibility = android.view.View.GONE
//            volver.visibility = android.view.View.VISIBLE
//        }

//        volver.setOnClickListener {
//            titulo.visibility = android.view.View.VISIBLE
//            btdescubrir.visibility = android.view.View.VISIBLE
//            logros.visibility = android.view.View.VISIBLE
//            volver.visibility = android.view.View.GONE
//        }


    }

}