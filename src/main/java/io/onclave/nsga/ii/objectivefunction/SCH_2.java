/*
 * This repository / codebase is Open Source and free for use and rewrite.
 */
package io.onclave.nsga.ii.objectivefunction;

import io.onclave.nsga.ii.Interface.IObjectiveFunction;
import io.onclave.nsga.ii.api.Service;
import io.onclave.nsga.ii.datastructure.Chromosome;
import io.onclave.nsga.ii.datastructure.ParetoObject;

/**
 *
 * @author sajib
 */
public class SCH_2 implements IObjectiveFunction {

    @Override
    public double objectiveFunction(Chromosome chromosome) {
        return objectiveFunction(Service.decodeGeneticCode(chromosome.getGeneticCode()));
    }

    @Override
    public double objectiveFunction(ParetoObject paretoObject) {
        return objectiveFunction(paretoObject.getChromosome());
    }

    @Override
    public double objectiveFunction(double geneVaue) {
        return Math.pow(geneVaue, 2);
    }
    
}
