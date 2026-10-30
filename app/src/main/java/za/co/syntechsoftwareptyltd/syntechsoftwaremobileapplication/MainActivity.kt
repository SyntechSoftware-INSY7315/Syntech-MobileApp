package za.co.syntechsoftwareptyltd.syntechsoftwaremobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        showHome()
    }


    // ==========================================
    // HOME
    // ==========================================

    private fun showHome() {

        setContentView(R.layout.activity_main)

        val exploreServicesButton =
            findViewById<Button>(R.id.exploreServicesButton)

        val startProjectButton =
            findViewById<Button>(R.id.startProjectButton)

        exploreServicesButton.setOnClickListener {
            showServices()
        }

        startProjectButton.setOnClickListener {
            showContact()
        }

        setupNavigation()
    }


    // ==========================================
    // SERVICES
    // ==========================================

    private fun showServices() {

        setContentView(R.layout.activity_services)

        setupNavigation()
    }


    // ==========================================
    // PORTFOLIO
    // ==========================================

    private fun showPortfolio() {

        setContentView(R.layout.activity_portfolio)

        val visitWebsiteButton =
            findViewById<Button>(R.id.visitWebsiteButton)

        visitWebsiteButton.setOnClickListener {

            Toast.makeText(
                this,
                "Portfolio website coming soon",
                Toast.LENGTH_SHORT
            ).show()
        }

        setupNavigation()
    }


    // ==========================================
    // NEWS
    // ==========================================

    private fun showNews() {

        setContentView(R.layout.activity_news)

        val readNews1 =
            findViewById<Button>(R.id.readNews1)

        val readNews2 =
            findViewById<Button>(R.id.readNews2)

        readNews1.setOnClickListener {

            Toast.makeText(
                this,
                "Opening article...",
                Toast.LENGTH_SHORT
            ).show()
        }

        readNews2.setOnClickListener {

            Toast.makeText(
                this,
                "Opening article...",
                Toast.LENGTH_SHORT
            ).show()
        }

        setupNavigation()
    }


    // ==========================================
    // CONTACT
    // ==========================================

    private fun showContact() {

        setContentView(R.layout.activity_contact)

        val sendMessageButton =
            findViewById<Button>(R.id.sendMessageButton)

        sendMessageButton.setOnClickListener {

            Toast.makeText(
                this,
                "Thank you! Your message has been received.",
                Toast.LENGTH_LONG
            ).show()
        }

        setupNavigation()
    }


    // ==========================================
    // BOTTOM NAVIGATION
    // ==========================================


    private fun setupNavigation() {

        val home = findViewById<View>(R.id.navHome)
        val services = findViewById<View>(R.id.navServices)
        val portfolio = findViewById<View>(R.id.navPortfolio)
        val news = findViewById<View>(R.id.navNews)
        val contact = findViewById<View>(R.id.navContact)

        home.setOnClickListener {
            showHome()
        }

        services.setOnClickListener {
            showServices()
        }

        portfolio.setOnClickListener {
            showPortfolio()
        }

        news.setOnClickListener {
            showNews()
        }

        contact.setOnClickListener {
            showContact()
        }
    }

}