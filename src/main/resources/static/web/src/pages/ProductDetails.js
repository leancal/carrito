import React, { useContext } from "react";
import { useParams } from "react-router-dom";
import { CartContext } from "../contexts/CartContext";
import { ProductContext } from "../contexts/ProductContext";

const ProductDetails = () => {
  // get product id from the url
  const { id } = useParams();
  const { products } = useContext(ProductContext);
  const { addToCart } = useContext(CartContext);

  // get the single product based on the id
  const product = products.find((item) => {
    return item.id === parseInt(id);
  });

  //if product is not found
  if (!product) {
    return (
      <section className="h-screen flex justify-center items-center">
        Cargando...
      </section>
    );
  }

  // destructure product
  const { nombre, urlImg, descripcion, stock, precio } = product; 

  return (
    <section className="pt-32 pb-12 ñg:py-32 h-screen flex items-center">
      <div className="container mx-auto">
        <div className="flex flex-col lg:flex.row items-center">
          <div className="flex flex-1 justify-center items-center mb-8 lg:mb-0 bg-purple-200">
            <img
              src={urlImg}
              alt={nombre}
              className="max-w-[200px] lg:max-w-sm"
            />
          </div>
          {/*text*/}
          <div className="flex-1 text-center lg:text-left">
            <h1 className="text-[26px] font-medium mb-2 max-w-[450px] mx-auto">{nombre}</h1>
            <div className="text-x1 text-red-500 font-medium mb-6">$ {precio}</div>
            <p className="mb-8">{descripcion}</p>
            <button onClick={()=> addToCart(product, product.id)} className="bg-primary py-4 px-8 text-white">Añadir al carrito</button>
          </div>
        </div>
      </div>
    </section>
  );
};

export default ProductDetails;
