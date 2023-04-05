import React from "react";
import WomanImg from "../img/woman_hero.png";
import { Link } from "react-router-dom";

const Hero = () => {
  return (
    <section className=" h-[800px] bg-hero bg-no-repeat bg-cover bg-center py-24">
      <div className="container mx-auto h-full">
        <div className="flex flex-col justify-center">
          <div className="font-semibold flex items-center uppercase">
            <div className="w-10 h-[2px] bg-red-500 mr-3">Nuevos Lanzamientos</div>
          </div>
          <h1 className="translate-y-12 text-[70px] leading-[1.1] font-light mb-4">
            MANTENGA SU HOGAR <br/>
            <span className="font-semibold">PROTEGIDO</span>
          </h1>
          <Link to={'/'} className="translate-y-10 self-start uppercase border-b-2 border-primary">
            Descubre Más
          </Link>
        </div>
        <div className="translate-x-[900px]  hidden xl:block ">
          <img className="w-[500px] " src={WomanImg} alt="camera"  />
        </div>
      </div>
    </section>
  );
};

export default Hero;
