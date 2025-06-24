import { defineConfig } from 'vite'
import {VitePWA} from 'vite-plugin-pwa'
import react from '@vitejs/plugin-react'


// https://vite.dev/config/
export default defineConfig({
  plugins: [
    react(),
    VitePWA(
      {
        registerType:'autoUpdate',
        includeAssets:['favicon.svg','robots.txt'],
        manifest:{
          name:"Practica 8",
          short_name:"P8",
          start_url:'/',
          display:"standalone",
          background_color:'#ffffff',
          theme_color:'#ffffff',
          lang:"es",
          screenshots:[
            {
              src:'/screenshots/scren-728-410.png',
              sizes:"728x410",
              type:"image/png",
              form_factor:"wide"
            },
            {
              src:'/screenshots/screen-736-1309.png',
              sizes:"736x1309",
              type:"image/png",
              form_factor:'narrow'
            }
          ],
          icons:[
            {
              src:'/icons/icon-192.png',
              sizes:"192x192",
              type:"image/png"
            },
            {
              src:'/icons/icon-512.png',
              sizes:"512x512",
              type:"image/png"
            }
          ]
        },
        workbox:{
           globPatterns: ["**/*.{js,css,html,ico,png,svg,webmanifest}"],
        },
      }
    )
  ],
})
